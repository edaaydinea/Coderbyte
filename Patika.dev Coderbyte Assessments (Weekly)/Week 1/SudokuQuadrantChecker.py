"""
Sudoku Quadrant Checker
Have the function SudokuQuadrantChecker(strArr) read the strArr parameter being passed which will represent a 9x9 Sudoku board of integers ranging from 1 to 9.
The rules of Sudoku are to place each of the 9 integers integer in every row and column and not have any integers repeat in the respective row, column, or 3x3 sub-grid.
The input strArr will represent a Sudoku board and it will be structured in the following format:
["(N,N,N,N,N,x,x,x,x)","(...)","(...)",...)] where N stands for an integer between 1 and 9 and x will stand for an empty cell.
Your program will determine if the board is legal; the board also does not necessarily have to be finished.
If the board is legal, your program should return the string legal but if it isn't legal, it should return the 3x3 quadrants (separated by commas) where the errors exist.
The 3x3 quadrants are numbered from 1 to 9 starting from top-left going to bottom-right.

For example, if strArr is: ["(1,2,3,4,5,6,7,8,1)",
                            "(x,x,x,x,x,x,x,x,x)",
                            "(x,x,x,x,x,x,x,x,x)",
                            "(1,x,x,x,x,x,x,x,x)",
                            "(x,x,x,x,x,x,x,x,x)",
                            "(x,x,x,x,x,x,x,x,x)",
                            "(x,x,x,x,x,x,x,x,x)",
                            "(x,x,x,x,x,x,x,x,x)",
                            "(x,x,x,x,x,x,x,x,x)"] then your program should return 1,3,4 since the errors are in quadrants 1, 3 and 4 because of the repeating integer 1.

Another example, if strArr is: ["(1,2,3,4,5,6,7,8,9)",
                                "(x,x,x,x,x,x,x,x,x)",
                                "(6,x,5,x,3,x,x,4,x)",
                                "(2,x,1,1,x,x,x,x,x)",
                                "(x,x,x,x,x,x,x,x,x)",
                                "(x,x,x,x,x,x,x,x,x)",
                                "(x,x,x,x,x,x,x,x,x)",
                                "(x,x,x,x,x,x,x,x,x)",
                                "(x,x,x,x,x,x,x,x,9)"] then your program should return 3,4,5,9.
Examples
Input: ["(1,2,3,4,5,6,7,8,1)",
        "(x,x,x,x,x,x,x,x,x)",
        "(x,x,x,x,x,x,x,x,x)",
        "(1,x,x,x,x,x,x,x,x)",
        "(x,x,x,x,x,x,x,x,x)",
        "(x,x,x,x,x,x,x,x,x)",
        "(x,x,x,x,x,x,x,x,x)",
        "(x,x,x,x,x,x,x,x,x)",
        "(x,x,x,x,x,x,x,x,x)"]
Output: 1,3,4

Author: Eda AYDIN
"""
def SudokuQuadrantChecker(strArr):

    numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9'}
    sudoku_matrix = [[column for column in row.strip('()').split(",")] for row in strArr]
    result = set()
    quadrantNumbers = lambda i, j: 3*(i//3) + (j//3 + 1)

    # Check Quadrants
    for x in [0,3,6]:
        for y in [0,3,6]:
            quadrants = set()
            nums = 0
            for i in [0,1,2]:
                for j in [0,1,2]:
                    cell = sudoku_matrix[x+i][y+j]
                    if cell in numbers:
                        nums += 1
                        quadrants.add(cell)
            if len(quadrants) != nums:
                result.add(str(quadrantNumbers(x,y)))

    #Check Rows and Columns
    for row_column in range(2):
        for i in range(9):
            dictionary = dict()
            for j in range(9):
                if row_column == 0:
                    x, y = (i,j)
                else:
                    x, y = (j,i)
                cell = sudoku_matrix[x][y]
                if cell in numbers:
                    if cell in dictionary:
                        dictionary[cell][0] += 1
                        dictionary[cell][1].append((x,y))
                    else:
                        dictionary[cell] = [1,[(x,y)]]
            for key, value in dictionary.items():
                if value[0] > 1:
                    result.update([str(quadrantNumbers(t[0], t[1])) for t in value[1]])

    if result:
        return ','.join(sorted(list(result)))
    else:
        return 'legal'

print(SudokuQuadrantChecker(input()))