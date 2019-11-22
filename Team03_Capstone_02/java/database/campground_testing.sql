SELECT site.site_id 
FROM site 
INNER JOIN campground 
ON campground.campground_id = site.campground_id
WHERE campground.name = 'Blackwoods';

----------------------------------------------------------

select * from site;

begin transaction;

INSERT INTO reservation (site_id, name, from_date, to_date, create_date) VALUES ( 622, 'Smith family', CAST('2019-11-03' AS DATE), CAST('2019/11/13' AS DATE), CAST('2019/10/26' AS DATE));

rollback;

DELETE FROM RESERVATION WHERE SITE_ID = 622;
SELECT * FROM RESERVATION;

----------------------------------------------------------------
---gets reservations for sites that have has reservatiosn before
--count(reservation.reservation_id), S.site_id, campground.name, site_number, open_from_mm, open_to_mm, daily_fee, from_date, to_date
SELECT count(reservation.reservation_id), S.site_id, site_number, campground.name, open_from_mm, open_to_mm, daily_fee
FROM site S 
INNER JOIN reservation ON s.site_id = reservation.site_id
INNER JOIN campground ON campground.campground_id = S.campground_id
WHERE (

        (
        from_date > cast('2020-03-01' as date) or To_date <= cast('2020-03-01' as date)
        ) 
        and 
        (
        from_date >= cast('2020-03-06' as date) or to_date < cast('2020-03-06' as date)
        )
        
        
        ) 
        AND campground.campground_id = 5
GROUP BY s.site_id, campground.name, open_from_mm, open_to_mm, daily_fee
order by count(reservation.reservation_id) desc;
--limit 5;

				
select * from reservation r
inner join site s
on s.site_id = r.site_id
inner join campground c
on s.campground_id = c.campground_id;

select * from reservation;
WHERE (

        (
        from_date > cast('2019-11-13' as date) or To_date <= cast('2019-11-13' as date)
        ) 
        and 
        (
        from_date >= cast('2019-11-24' as date) or to_date < cast('2019-11-24' as date)
        )
        
        
        ) ;

--------------------------------------

--gets sites that have never been reserved
SELECT site.site_id, site_number, campground.name, open_from_mm, open_to_mm, daily_fee FROM SITE 
INNER JOIN campground 
on site.campground_id = campground.campground_id
WHERE site_id not in (
        SELECT S.site_id FROM site S INNER JOIN reservation 
        ON s.site_id = reservation.site_id 
        INNER JOIN campground 
        ON campground.campground_id = site.campground_id
        WHERE campground.campground_id = 1) 
AND campground.campground_id = 1
limit 5;
------------------------------------------------------------------
select count(r.reservation_id), s.site_id, s.site_number, c.name, c.open_from_mm, c.open_to_mm, c.daily_fee from site s
inner join reservation r
on r.site_id = s.site_id
inner join campground c
on c.campground_id = s.campground_id
where reservation_id in (
        SELECT count(reservation.reservation_id)--, S.site_id, site_number, campground.name, open_from_mm, open_to_mm, daily_fee
        FROM site S 
        INNER JOIN reservation ON s.site_id = reservation.site_id
        INNER JOIN campground ON campground.campground_id = S.campground_id
        WHERE ((from_date > cast('2019-11-01' as date) or To_date < cast('2019-11-01' as date)) 
        and (from_date > cast('2019-11-13' as date) or to_date < cast('2019-11-13' as date))) 
        AND campground.campground_id = 1
        GROUP BY s.site_id, campground.name, open_from_mm, open_to_mm, daily_fee
        order by count(reservation.reservation_id) desc)
        

AND
(       SELECT site.site_id, site_number, campground.name, open_from_mm, open_to_mm, daily_fee FROM SITE 
        INNER JOIN campground 
        on site.campground_id = campground.campground_id
        WHERE site_id not in (
                SELECT S.site_id FROM site S INNER JOIN reservation 
               ON s.site_id = reservation.site_id 
              INNER JOIN campground 
              ON campground.campground_id = site.campground_id
               WHERE campground.campground_id = 1) 
        AND campground.campground_id = 1)
group by s.site_id, s.site_number, c.name, c.open_from_mm, c.open_to_mm, c.daily_fee;
				