CREATE TABLE family_members
(
    id           BIGINT                      NOT NULL GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    user_id       BIGINT                      NOT NULL,
    family_id     BIGINT                      NOT NULL,
    request_date  TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,
    valid_to      TIMESTAMP WITHOUT TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP + INTERVAL '7 days',
    approved     BOOLEAN                     NOT NULL DEFAULT FALSE,
    approved_date TIMESTAMP WITHOUT TIME ZONE NULL,
    CONSTRAINT FK_familyMembers_users_user_id_id FOREIGN KEY (user_id) REFERENCES users (id),
    CONSTRAINT FK_familyMembers_families_family_id_id FOREIGN KEY (family_id) REFERENCES families (id)
);