# 🎓 Full-Stack Java Spring Boot Web Portal & Multi-Page Data Engine

An autonomous, database-persistent, interactive e-learning ecosystem, multi-page web cluster, and concurrent multi-currency conversion REST API microservice. Engineered under the corporate brand **haladevelopers** specifically to provide high-impact, localized digital literacy and AI skill models for the youth of Sindh, Pakistan.

---

## 📸 Platform Interface Preview

### 🗣️ Localized Sindhi Language Interface (Right-to-Left Layout)
![Sindh Academy Sindhi Interface](https://githubusercontent.com)

### 🇬🇧 English Masterclass Interface (Widescreen Grid Layout)
![Sindh Academy English Interface](https://githubusercontent.com)

---

## 🛠️ Core Architectural Capabilities & Tech Stack

- **Multi-Page Web Cluster Architecture:** Implemented modular Spring Boot MVC routing layers to serve independent frontend templates, segregating the core learning matrix dashboard from dedicated portal sections like the multi-column **About Hub** and the cinematic **Video Showroom**.
- **Cinematic Media Streaming Integration:** Engineered client-side matching algorithms capable of extracting unique 11-character YouTube video ID vectors dynamically on-the-fly, embedding responsive 16:9 cinematic video players natively inside individual lesson modules.
- **Widescreen Multi-Column Fluid Grid:** Modernized the complete application layout to an ultra-wide **1200px desktop grid matrix**, upgrading content card components into responsive double-row flex tiers that remain perfectly scale-proof across all screen resolutions and zoom tracks.
- **Relational Data Persistence Layer:** Integrated **Spring Data JPA & Hibernate** frameworks wired directly to an embedded relational databank engine (**H2/MySQL**) running persistent file state systems with custom expanded column definition models to accept unlimited text guides.
- **Bi-Directional Multilingual Toggle Engine:** Developed a high-efficiency JavaScript translation dictionary module capable of switching all fixed UI labels, multi-page navigation links, forms, and instructional contents between English and localized **Sindhi Arabic typography** with an adaptive **Right-to-Left (RTL)** text alignment format.
- **Administrative Access Security Checkpoints:** Enforced server-side entry gate authentication parameters on sensitive data nodes, safeguarding lesson deletion mechanics behind a master password validation layer.

---

## 🔌 API Documentation & Verification Endpoints

- **`GET /`** - Access the live visual widescreen learning dashboard interface.
- **`GET /about.html`** - Standalone multi-column presentation detailing project roadmaps in parallel dual languages.
- **`GET /videos.html`** - Dedicated 3-column media showroom linking directly to the official **[@aiforkinder](https://youtube.com)** YouTube streaming network.
- **`GET /api/lessons`** - Dynamic retrieval stream of curriculum blocks (Supports filtering via `?category=English|AI|Earning`).
- **`GET /api/lessons/add`** - Secured parameter injection route to store custom lesson modules and streaming video paths natively to database storage tables.
- **`GET /api/lessons/delete`** - Authentication gate validation endpoint to purge specific records by unique primary keys.
- **`GET /api/convert`** - Automated currency conversion matrix tracking USD, EUR, INR, and PKR parameters concurrently.
- **`GET /api/history`** - System transaction ledger logging calculation query histories.
