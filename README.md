# 🎓 Full-Stack Java Spring Boot Web Portal & Multi-Page Subject Room Cluster

An autonomous, database-persistent, interactive e-learning ecosystem, multi-page web cluster, and concurrent multi-currency conversion REST API microservice. Engineered under the corporate brand **haladevelopers** specifically to provide high-impact, localized digital literacy and AI skill models for the youth of Sindh, Pakistan.

---

## 📸 Platform Interface Preview

### 🗣️ Localized Sindhi Language Interface (Right-to-Left Layout)
![Sindh Academy Sindhi Interface](https://githubusercontent.com)

### 🇬🇧 English Masterclass Interface (Widescreen Grid Layout)
![Sincerely Academy English Interface](https://githubusercontent.com)

---

## 🛠️ Core Architectural Capabilities & Tech Stack

- **Compact Layout & Deep-Linked Subject Rooms:** Restructured the root dashboard landing view into a clean, zero-clutter administrative command center. Isolated content streams into standalone, single-responsibility subject showrooms (`english.html`, `ai.html`, `earning.html`) optimized for independent rendering performance.
- **Dynamic Dropdown Selection Room Navigator Menu:** Engineered an intelligent, client-side JavaScript routine that auto-populates a dropdown selection menu natively by query-streaming the relational databank records. Lessons are mapped dynamically by Lesson Number, Category Stream, and Topic Summary, triggering a cross-page router engine to launch the target room in a fresh window tab on index selection.
- **Automated Database-Driven Translation Engine:** Migrated the localized UI from static code lookup tables into a dynamic side-by-side database schema architecture. The platform stores English and Sindhi columns (`titleSd`, `contentSd`, etc.) concurrently inside persistent hard-drive relational storage tiers, enabling seamless multi-language dashboard rendering with zero source code changes required forever.
- **Server-Side Data Validation Gateways:** Integrated `spring-boot-starter-validation` dependencies inside the persistence model layer. Enforced strict programmatic `@NotBlank` and `@Size(min=3, max=5000)` constraint bounds across incoming JSON payload parameters, automatically neutralizing broken strings or empty payloads before disk serialization.
- **Cinematic Media Streaming Integration:** Engineered client-side matching algorithms capable of extracting unique 11-character YouTube video ID vectors dynamically on-the-fly, embedding responsive 16:9 cinematic video players natively inside individual lesson modules.

---

## 🔌 API Documentation & Verification Endpoints

- **`GET /`** - Access the live, ultra-compact root administrative command hub view.
- **`GET /english.html`** - Dedicated deep-linked classroom showroom for English Grammar and Pronunciation sound drills.
- **`GET /ai.html`** - Dedicated deep-linked classroom showroom for Advanced Prompt Engineering and LLM controls.
- **`GET /earning.html`** - Dedicated deep-linked classroom showroom for Digital Monetization and Freelance strategies.
- **`GET /about.html`** - Standalone multi-column presentation detailing project roadmaps in parallel dual languages.
- **`GET /videos.html`** - Dedicated 3-column media showroom linking directly to the official **[@aiforkinder](https://youtube.com)** YouTube streaming network.
- **`GET /live.html`** - Dynamic virtual classroom connection matrix tracking live Zoom/Google Meet links.
- **`GET /api/lessons`** - Dynamic retrieval stream of curriculum blocks (Serves concurrent English and Sindhi data fields).
- **`GET /api/lessons/add`** - Secured parameter injection route to validate and store side-by-side English & Sindhi text strings natively to database storage tables.
