## Part 1: Test it with SQL

SELECT *
FROM job;

## Part 2: Test it with SQL

SELECT location
FROM Employer
WHERE location = "St. Louis City";

## Part 3: Test it with SQL

DROP TABLE job;

## Part 4: Test it with SQL

SELECT name, description
FROM skill
LEFT JOIN job ON skill.id = job.id;
WHERE