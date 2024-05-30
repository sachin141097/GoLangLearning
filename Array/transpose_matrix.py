def find_transpose(matrix):
    rows = len(matrix)
    cols = len(matrix[0])
    transposed_matrix = [[None for row in range(rows)] for col in range(cols)]
    for row in range(rows):
        for col in range(cols):
            transposed_matrix[col][row] = matrix[row][col]
    return transposed_matrix


def display_matrix(matrix):
    rows = len(matrix)
    cols = len(matrix[0])
    for row in range(rows):
        for col in range(cols):
            print(matrix[row][col], end=" ")
        print()


if __name__ == "__main__":
    rows = int(input(f"Enter number of rows: "))
    cols = int(input(f"Enter number of cols: "))
    matrix = []
    for row in range(rows):
        ans = []
        for col in range(cols):
            element = int(input(f"Enter the value of element: "))
            ans.append(element)
        matrix.append(ans)
    print(f"Value of original matrix is:")
    display_matrix(matrix)
    transpose = find_transpose(matrix)
    print(f"Value of transposed matrix is:")
    display_matrix(transpose)
