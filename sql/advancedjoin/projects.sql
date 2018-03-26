SELECT TAB1.START_DATE,
  MIN(TAB2.END_DATE) AS END_DATE
FROM
  (SELECT START_DATE
  FROM PROJECTS
  WHERE START_DATE NOT IN
    (SELECT END_DATE FROM PROJECTS
    )
  ) TAB1,
  (SELECT END_DATE
  FROM PROJECTS
  WHERE END_DATE NOT IN
    (SELECT START_DATE FROM PROJECTS
    )
  ) TAB2
WHERE TAB1.START_DATE < TAB2.END_DATE
GROUP BY START_DATE
ORDER BY END_DATE - START_DATE, START_DATE;