with open("Book1.csv","r") as file1: #tells it top open the file
    listy=[]
    for line in file1.readlines(): # parker and blake helped me alot with the beginign part basically the rest of it is copy paste for the rest of the code once you get the first part you can invert the code
        currentlist=line.strip().split(",") # appends each letter so splits every time its a commo 
      
        listy.append(currentlist)
def search(uiword,letters):
    z=0
    lettertosearchfor=uiword[0]
    for i in range(len(letters)):  # i and J both =0 in real world it is equal to 1
        for j in range(len(letters[i])):
            if lettertosearchfor == letters[i][j]: #indexing the list of rows # blake
                z+=1
                print(f"Found the {z} letter!") # sub loop this incremints the i and this steps it throught untill it finds the letter usign z+1
                x=h_1(i,j,uiword)
                if x is not None: #checks type of varible IF thier isnt a return statment it returns it to none and if its true its going to return i andj 
                    print(f"{uiword} is at ({i},{j}") #^checking to see if its a none type #blake
                elif h_2(i,j,uiword) is not None:
                    print(f"{uiword} is at ({i},{j}")
                elif v_1(i,j,uiword) is not None:           # its  knows how to go up and down   because i and j are two seperate list and it keeps going throught untill it finds each letter 
                    print(f"{uiword} is at ({i},{j}")
                elif v_2(i,j,uiword) is not None:               #i and j is how it knows were its is on the board and it incrimants by z being z+=1
                    print(f"{uiword} is at ({i},{j}")
                #elif d_1(i,j,uiword) is not None:
                  ##  print(f"{uiword} is at ({i},{j}")
                #elif d_2(i,j,uiword) is not None:
                   # print(f"{uiword} is at ({i},{j}")
                 
def h_1(i,j,hword):
    # i = row , j = collium
        flag = True
        for k in range(len(hword)): # chekcs of the wrod 
            if j+k < len(listy[i]):
                if hword[k] == listy[i][j+k]:#to change direction j+k it works the opposite # checks each letter in the the listed word and then if it dosnt then it returns a false
                    pass
                else:
                    flag = False
                    break                               
            else:
                flag = False
                break
        if flag == True:
            print("Found the word!") # returns the x,y coordinate  of the word
            return i , j
def h_2(i,j,hword):
    # i = row , j = collium
    flag = True
    for k in range(len(hword)):
        if (j-k) >=0:
            if hword[k] == listy[i][j-k]:#to change direction j-k
                pass
            else:
                flag = False
                break
        else:
            flag = False
            break
    if flag == True:
        print("Found the word!")
        return i , j
def v_1(i,j,hword):
    # i = row , j = collium
    flag = True
    for k in range(len(hword)):
        if (i-k)>=0:
            if hword[k] == listy[i-k][j]:
                pass
            else:
                flag = False
                break
        else:
            flag = False
            break
    if flag == True:
        print("Found the word!")
        return i , j


def v_2(i,j,hword):             #i = row j    =colum k = length of the word   
    # i = row , j = collium
    flag = True
    for k in range(len(hword)):
        if (i+k)<(len(listy)): #needs this so it dosnt go below 0
            if hword[k] == listy[i+k][j]:
                pass
            else:
                flag = False
                break
        else:
            flag = False
            break
    if flag == True:
        print("Found the word!")
        return i , j

#def d_1(i, j, hword):
                        # i = row , j = collium
 # flag = True
  #for k in range(len(hword)):
   # if (j - k) >= 0 and (i +
   #                      k) < (len(listy)):  #needs this so it dosnt go below 0
    #  if hword[k] == listy[i + k][j - k]:
    #    pass
    #  else:
    #    flag = False
     #   break
   # else:  #
   #   flag = False
    #  break  #j+k>i+2
  #if flag == True:
   ## print("Found the word!")
   # return i, j


#def d_2(i, j, hword):
                                    # i = row , j = collium
  #flag = True
  #for k in range(len(hword)):
    #if (j + k) < (len(listy)) and (i-k) >= 0:  #needs this so it dosnt go below 0
      #if hword[k] == listy[i - k][j + k]:
#pass
     # else:
        ###flag = False
        #break
    #else:
      #flag = False
     # break
  #if flag == True:
   # print("Found the word!")   #it finds the letters for both diagonals but i have it set up wrong so it cant print the word out 
   # return i, j

 # save first letter to new variable than when it keeps going then reset 
search("MAT",listy)

#diagonally is comibnation of both vy and horizontal 
#blake parker blake

#basically is each row is a seperate list so it is a 2d list 