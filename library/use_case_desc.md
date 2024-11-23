# Use Case 1: Register User
**Actor:** User
## Main Flow:
1. User accesses the registration form.
2. User enters the required information: name, email, and password.
3. System validates the input:
    - Checks if all fields are filled out.
    - Validates the email format.
    - Ensures the password meets the security criteria.
4. If validation is successful, the system saves the user's information in the database.
5. The system sends a confirmation message to the user, informing them that registration was successful.
6. The user is granted access to the system.
## Alternative Flows:
- **Invalid Input**:
    - If the user enters invalid data (e.g., empty fields, invalid email format), the system highlights the errors and prompts the user to correct them.
- **Email Already Registered**:
    - If the entered email is already registered in the system, the system asks the user to provide a different email and informs them of the issue.
- **Password Too Weak**:
    - If the password does not meet the required criteria (e.g., minimum length or includes special characters), the system prompts the user to choose a stronger password.

-----------------------------------------------------------------------------------------------------------------------------------

# Use Case 2: Search for Books
**Actor:** User
## Main Flow:
1. User accesses the search functionality of the library system.
2. User enters a search query in the search field (e.g., book title, author, genre).
3. The system processes the query and searches the book database.
4. The system returns a list of books that match the search query.
5. The system displays the results to the user, including book details (e.g., title, author, availability).
## Alternative Flows:
- **No Results Found**:
    - If no books match the search query, the system informs the user that no results were found and may suggest related queries.
- **Invalid Search Input**:
    - If the user enters an incomplete or invalid search term, the system prompts the user to refine their search or provides suggestions.
  
----------------------------------------------------------------------------------------------------------------------------------------

# Use Case 3: Browse Book Categories
**Actor:** User
## Main Flow:
1. User accesses the "Browse Categories" section of the library system.
2. The system displays a list of available book categories (e.g., Fiction, Non-fiction, Science, History).
3. User selects a category to view more books within that category.
4. The system shows a list of books under the selected category, including book details (e.g., title, author, availability).
## Alternative Flows:
- **No Categories Available**:
    - If there are no categories available, the system displays a message indicating that no categories are currently available.
- **Category Load Failure**:
    - If the system encounters an error while loading categories, it displays an error message and suggests trying again later.
  
--------------------------------------------------------------------------------------------------------------------------------------

# Use Case 4: Borrow Books
**Actor:** User
## Main Flow:
1. User selects the books they wish to borrow from the available books in the system.
2. The system checks the availability of each selected book.
3. If all books are available, the system confirms the borrow request.
4. The system updates the user's account to reflect the borrowed books and assigns a due date for return.
5. The system displays a confirmation message to the user, confirming the successful borrow.
## Alternative Flows:
- **Book Unavailable**:
    - If any selected book is unavailable, the system informs the user of the unavailability and may suggest alternative books or the user may opt to wait for availability.
- **User Exceeds Borrow Limit**:
    - If the user has reached the borrowing limit (e.g., 5 books), the system prevents them from borrowing more books and informs them about the limit.
- **Overdue Books**:
    - If the user has overdue books, the system denies the borrowing request and informs them that they need to return overdue books first.

----------------------------------------------------------------------------------------------------------------------------------------

# Use Case 5: Return Books
**Actor:** User
## Main Flow:
1. User selects the books they wish to return.
2. The system processes the return request and verifies that the books are eligible for return.
3. The system updates the book status to "available" in the database.
4. The system updates the user's borrowing record and clears the due date.
5. The system displays a return confirmation message to the user.
## Alternative Flows:
- **Late Return**:
    - If the user returns the books after the due date, the system applies a late fee and informs the user about the extra charges.
- **Damaged Book**:
    - If the returned book is damaged, the system alerts the user about the damage and may impose a fee for the damage.
- **Incomplete Return**:
    - If the user attempts to return books that were not borrowed or were already returned, the system informs the user of the discrepancy.

------------------------------------------------------------------------------------------------------------------------------------------

