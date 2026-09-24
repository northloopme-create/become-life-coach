# Become

Become is an open-source daily life coach for building confidence, discipline and achievable momentum. It turns long-term goals into milestone timelines, daily reach targets and small missions that reward consistent progress.

## Features

- Flexible 5, 10, 20 and 30-minute daily missions
- 30-day, 90-day and six-month goal timelines
- Milestones, XP, levels and streaks
- Motivational coaching prompts
- Private journal and account-synced progress
- Responsive web experience and Android APK

## Use Become

- Web app: https://become-better-daily.ponderosa016.chatgpt.site
- Android APK: https://github.com/northloopme-create/become-life-coach/releases/download/latest/become.apk

## Local development

```bash
pnpm install
pnpm dev
```

The hosted app uses Cloudflare D1 and ChatGPT sign-in through the Sites platform. The Android project is a lightweight secure WebView shell around the hosted application.

## Android build

The workflow in `.github/workflows/android.yml` builds the APK on every push to `main` and publishes `become.apk` to the `latest` GitHub release.

## Contributing

Issues and pull requests are welcome. Keep changes focused, accessible and aligned with Become's central principle: ambitious direction, achievable daily action.

## Licence

MIT © 2026 Northloop
