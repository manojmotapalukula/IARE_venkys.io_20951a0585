
def netsalary(sal,comp_deduction,state_deduction,pension,weeks):
    return weeks*(sal-(((comp_deduction+state_deduction+pension)*sal)/100))


sal=int(input("Enter salary per week $ "))
comp_deduction = float(input("Enter company deduction % "))
state_deduction = float(input("Enter state deduction % "))
pension = float(input("Enter pension deduction % "))
weeks = int(input("for how many weeks you want to calculate? "))
'''total_deduction = ((comp_deduction + state_deduction + pension)*sal)/100
net_salary = (sal - total_deduction)'''
print(netsalary(sal,comp_deduction,state_deduction,pension,weeks))