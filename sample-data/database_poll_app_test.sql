show procedure status;
UPDATE `mysql`.`proc` p SET definer = 'root@%' WHERE definer='deliveryDB@%'

SELECT polls.id as poll_id, polls.question, choices.id as choice_id, choices.choice_text, choices.votes
FROM choices, polls
WHERE choices.poll_id = polls.id;