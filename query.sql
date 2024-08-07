SELECT 
    c.year,
    m.name AS model,
    t.name AS type,
    e.engine_size,
    AVG(s.mileage) AS average_mileage,
    AVG(s.price) AS average_price
FROM 
    cars c
JOIN 
    models m ON c.model_id = m.id
JOIN 
    types t ON c.type_id = t.id
JOIN 
    specifications s ON c.id = s.car_id
GROUP BY 
    c.year, m.name, t.name
ORDER BY 
    c.year, m.name;
