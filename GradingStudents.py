def gradingStudents(grades):
    res = []
    for grade in grades:
    #     if grade>=38 and grade % 5 > 3:
    #         grade += (5-(grade % 5))
    #         res.append(grade)
        if grade >= 38:
            mod5 = grade % 5
            if mod5 >= 3:
                grade = grade + (5 - mod5)
                res.append(grade)
            else:
                res.append(grade)
        else:
            res.append(grade)
                
    return res
    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    grades_count = int(input().strip())

    grades = []

    for _ in range(grades_count):
        grades_item = int(input().strip())
        grades.append(grades_item)

    result = gradingStudents(grades)

    fptr.write('\n'.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
