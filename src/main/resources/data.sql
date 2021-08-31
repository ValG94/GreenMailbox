insert into end_user (id, name)
VALUES (1, 'Valery'),
       (2, 'Clara');

insert into challenge (id, level, like_challenge, name_challenge, description, img_url, date_creation)
VALUES (1, 200, 5, 'Green day', 'nettoyer sa boite mail et la rendre green',
        'https://banner2.cleanpng.com/20190716/zfq/kisspng-world-map-globe-vector-graphics-the-importance-of-listening-listening-for-a-change-5d2e7df5c8cce4.0819082415633279898225.jpg',
        '16-07-2021'),
       (2, 150, 4, 'Green day', 'nettoyer sa boite mail et la rendre green',
        'https://banner2.cleanpng.com/20190716/zfq/kisspng-world-map-globe-vector-graphics-the-importance-of-listening-listening-for-a-change-5d2e7df5c8cce4.0819082415633279898225.jpg',
        '16-07-2021'),
       (3, 100, 2, 'Green day', 'nettoyer sa boite mail et la rendre green',
        'https://banner2.cleanpng.com/20190716/zfq/kisspng-world-map-globe-vector-graphics-the-importance-of-listening-listening-for-a-change-5d2e7df5c8cce4.0819082415633279898225.jpg',
        '16-07-2021'),
       (4, 50, 4, 'Green day', 'nettoyer sa boite mail et la rendre green',
        'https://banner2.cleanpng.com/20190716/zfq/kisspng-world-map-globe-vector-graphics-the-importance-of-listening-listening-for-a-change-5d2e7df5c8cce4.0819082415633279898225.jpg',
        '16-07-2021');

insert into content_challenge (id, answers, questions, challenge_id)
VALUES (1, 'True', '"Un mail est-il plus lourd vs publication Teams ?"', 1)

insert into resource (url_resource) VALUES
    (https://support.microsoft.com/fr-fr/office/organiser-votre-bo%C3%AEte-de-r%C3%A9ception-9aea8ad7-883d-459b-a3ea-ae20f06cfb32),
    (https://www.greenit.fr/2018/09/11/reduire-limpact-de-e-mails/)