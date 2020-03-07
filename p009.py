def are_pythagorian(a, b, c,):
    return a*a + b*b == c*c


def print_pythagorian_theorem_triples():
    for a in range(999, 0, -1):
        for b in range(a, 0, -1):
            c = 1000 - a - b
            if are_pythagorian(a, b, c):
                print(a * b * c)


print_pythagorian_theorem_triples()
