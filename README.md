# 🎓 Full-Stack Java Spring Boot Web Portal & Database-Driven Bilingual Engine

An autonomous, database-persistent, interactive e-learning ecosystem, multi-page web cluster, and concurrent multi-currency conversion REST API microservice. Engineered under the corporate brand **haladevelopers** specifically to provide high-impact, localized digital literacy and AI skill models for the youth of Sindh, Pakistan.

---

## 📸 Platform Interface Preview

### 🗣️ Localized Sindhi Language Interface (Right-to-Left Layout)
![Sindh Academy Sindhi Interface](https://githubusercontent.com)

### 🇬🇧 English Masterclass Interface (Widescreen Grid Layout)
![Sindh Academy English Interface](https://githubusercontent.com)

---

## 🛠️ Core Architectural Capabilities & Tech Stack

- **Automated Database-Driven Translation Engine:** Migrated the localized UI from static code lookup tables into a dynamic side-by-side database schema architecture. The platform stores English and Sindhi columns (`titleSd`, `contentSd`, etc.) concurrently inside persistent hard-drive relational storage tiers, enabling seamless multi-language dashboard rendering with zero source code changes required forever.
- **Server-Side Data Validation Gateways:** Integrated `spring-boot-starter-validation` dependencies inside the persistence model layer. Enforced strict programmatic `@NotBlank` and `@Size(min=3, max=5000)` constraint bounds across incoming JSON payload parameters, automatically neutralizing broken strings or empty payloads before disk serialization.
- **Multi-Page Web Cluster Architecture:** Implemented modular Spring Boot MVC routing layers to serve independent frontend templates, segregating the core learning matrix dashboard from dedicated portal sections like the multi-column **About Hub**, the cinematic **Video Showroom**, and virtual **Live Lecture classrooms**.
- **Cinematic Media Streaming Integration:** Engineered client-side matching algorithms capable of extracting unique 11-character YouTube video ID vectors dynamically on-the-fly, embedding responsive 16:9 cinematic video players natively inside individual lesson modules.
- **Widescreen Multi-Column Fluid Grid:** Modernized the complete application layout to an ultra-wide **1200px desktop grid matrix**, upgrading content card components into responsive double-row flex tiers that remain perfectly scale-proof across all screen resolutions and zoom tracks.

---

## 🔌 API Documentation & Verification Endpoints

- **`GET /`** - Access the live visual widescreen learning dashboard interface.
- **`GET /about.html`** - Standalone multi-column presentation detailing project roadmaps in parallel dual languages.
- **`GET /videos.html`** - Dedicated 3-column media showroom linking directly to the official **[@aiforkinder](https://youtube.com)** YouTube streaming network.
- **`GET /live.html`** - Dynamic virtual classroom connection matrix tracking live Zoom/Google Meet links.
- **`GET /api/lessons`** - Dynamic retrieval stream of curriculum blocks (Serves concurrent English and Sindhi data fields).
- **`GET /api/lessons/add`** - Secured parameter injection route to validate and store side-by-side English & Sindhi text strings natively to database storage tables.
- **`GET /api/convert`** - Automated currency conversion matrix tracking USD, EUR, INR, and PKR parameters concurrently.
