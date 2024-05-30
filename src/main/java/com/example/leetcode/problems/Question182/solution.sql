SELECT p.email FROM Person p
    JOIN Person t ON p.email = t.email AND
                     p.id != t.id
               GROUP BY p.email