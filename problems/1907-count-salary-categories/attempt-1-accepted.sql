# Write your MySQL query statement below
WITH cte AS (
    SELECT 
        account_id, 
        CASE WHEN income < 20000 THEN 'Low Salary'
        WHEN income BETWEEN 20000 AND 50000 THEN 'Average Salary'
        ELSE 'High Salary' END AS category
    FROM Accounts
), 
categories AS (
    SELECT 'Low Salary' AS category
    UNION
    SELECT 'Average Salary'
    UNION
    SELECT 'High Salary'
)

SELECT 
    c1.category,count(c2.account_id) AS accounts_count 
FROM categories c1 
LEFT JOIN cte c2 
    on c1.category = c2.category
GROUP BY c1.category;