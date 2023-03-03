#Using multithreading in python
import threading
def reverse_string(string):
    return string[::-1]

def reverse_words(paragraph):
    words = paragraph.split()
    threads = []
    reversed_words = [''] * len(words)
    for i, word in enumerate(words):
        t = threading.Thread(target=lambda i, word: reversed_words.__setitem__(i, reverse_string(word)), args=(i, word))
        threads.append(t)
        t.start()
    for t in threads:
        t.join()

    return ' '.join(reversed_words)

paragraph = input()
reversed_paragraph = reverse_words(paragraph)
print(reversed_paragraph)


#Using recursion in python
def rev(w):
    if len(w)==0:
        return ""
    else:
        return w[-1]+rev(w[:-1])
def rev_s(s):
    word=s.split()
    r_word=[rev(i) for i in word]
    return " ".join(r_word)
s=input("Enter a Paragraph:")
print(rev_s(s))
