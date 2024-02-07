select
    round(avg(
        case
            when car_type = 'SUV' then DAILY_FEE
            ELSE NULL
            END),0)
            AS AVERAGE_FEE
from
    car_rental_company_car;
