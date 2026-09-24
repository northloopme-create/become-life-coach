CREATE TABLE `app_state` (
	`id` integer PRIMARY KEY NOT NULL,
	`xp` integer DEFAULT 120 NOT NULL,
	`streak` integer DEFAULT 3 NOT NULL,
	`completed` text DEFAULT '[]' NOT NULL,
	`journal` text DEFAULT '[]' NOT NULL,
	`updated_at` text NOT NULL
);
