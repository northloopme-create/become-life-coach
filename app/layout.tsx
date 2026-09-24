import type { Metadata } from "next";
import "./globals.css";

export const metadata: Metadata = {
  title: "Become — Daily confidence & discipline",
  description: "A private daily coach for building confidence, discipline and better habits.",
  icons: {
    icon: "/favicon.svg",
    shortcut: "/favicon.svg",
  },
};

export default function RootLayout({
  children,
}: Readonly<{
  children: React.ReactNode;
}>) {
  return (
    <html lang="en">
      <body className="antialiased">{children}</body>
    </html>
  );
}
