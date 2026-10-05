num = int(input("digite o numero : "))

print("--- tabuada com for ---")

for i in range(1, 11):
    print(F"{num} x {i:2d} = {num * i}")
    
    print("\n--- tabuada com while ---")
    
    i = 1
    
    while i <= 10:
        print(F"{num} x {i:2d} = {num * i}")
        i += 1