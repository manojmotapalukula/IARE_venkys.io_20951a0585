def reverse_word(word):
    if len(word) == 0 or len(word) == 1:
        return word
    else:
        return reverse_word(word[1:]) + word[0]

def reverse_paragraph(paragraph):
    words = paragraph.split()
    reversed_paragraph = " ".join(list(map(reverse_word, reversed(words))))
    return reversed_paragraph

input_paragraph = input("Enter a paragraph: ")
reversed_paragraph = reverse_paragraph(input_paragraph)
print("Reversed paragraph:")
print(reversed_paragraph)
