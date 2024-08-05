# Step 0
- Confirm Understanding/ Clarifications: Check with the interviewer how it works by confirming current understanding
    - Expense tracking and sharing application
- Scope: Entity Design or the software solution
- How is the interaction with User: Command line arguments/ REST/ hardcoded ?
  - Answer: Via _**Command Line**_ - Command Design Pattern
- Data persistence: Need to implement with Database persistence?
  - Answer: Database

### Homework
- Class Diagram
- Schema Design
- Start the project and code the module with Spring Boot


## Requirements Document
- Users can **register** and **update** their profiles.
- A user's profile should contain at least their name, phone number and password.
- Users can participate in expenses with other users, or in groups.
- To add an expense, a user must specify either the group, or the other users involved in the expense, along with who paid what and who owes what.
    - They must also specify a description for the expense.

- A user can see their total owed amount.
- A user can see a history of the expenses they're involved in.
- A user can see a history of the expenses made in a group that they're participating in.
- Users shouldn't be able to query about groups they are not a member of.
- Only the user who has created a group can add/remove members to the group.

- Users can request a settle-up.
    - This should show a list of transactions, which when executed will ensure that the user no longer owes or is owed money from any other user.
    - Note that this need not settle-up any other users.
- Users can request a settle-up for any group they're participating in.
  - The application should show a list of transactions, which when executed, will ensure that everyone participating in the group is settled up (owes a net of 0 Rs). 
    - Note that will only deal with the expenses made inside that group. 
    - Expenses outside the group need not be settled.
### Good to Have Requirements
- When settling a group, we should try to minimize the number of transactions that the group members should make to settle up.
  - The minimum possible count would need a backtracking solution for all possibilities - not expected, but as much as possible.
  - Greedy algorithm?