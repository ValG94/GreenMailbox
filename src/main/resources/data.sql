insert into end_user (id, name)
VALUES (1, 'Valery'),
       (2, 'Clara');

insert into challenge (id, level, like_challenge, name_challenge, description, img_url, date_creation)
VALUES (1, 200, 5, 'Clean Green', 'Découvrir le Clean green pour rendre sa boite mail plus green',
        'https://static6.depositphotos.com/1107614/598/v/950/depositphotos_5985020-stock-illustration-green-earth.jpg',
        '16-07-2021'),
       (2, 150, 4, 'Box Green', 'Comment optimiser sa boite mail ?',
        'http://www.clker.com/cliparts/E/m/W/q/A/j/green-mailbox-hi.png',
        '16-07-2021'),
       (3, 100, 2, 'Green day', 'Journée pour cleaner son bureau et le rendre green',
        'https://www.greenofficemovement.org/wp-content/uploads/2020/06/Green-Office-Bologna-Logo.png',
        '16-07-2021'),
       (4, 50, 4, 'Green Idea', 'Brainstorming green pour trouver les idées qui nous rendrons encore plus éco responsable',
        'https://www.quickanddirtytips.com/sites/default/files/images/8213/Eco.jpg',
        '16-07-2021');

insert into content_challenge (id, answers, questions, challenge_id)
VALUES (1, 'True', '"Un mail est-il plus lourd vs publication Teams ?"', 1);

/*insert into resource (id, url_resource)
VALUES (1, 'https://support.microsoft.com/fr-fr/office/organiser-votre-bo%C3%AEte-de-r%C3%A9ception-9aea8ad7-883d-459b-a3ea-ae20f06cfb32'),
    (2, 'https://www.greenit.fr/2018/09/11/reduire-limpact-de-e-mails/');*/