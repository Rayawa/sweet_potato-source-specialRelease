# sweet_potato-source-specialRelease

English | [简体中文](README_zh.md)

Archived special-release source branches for the Sweet Potato Minecraft mod.

Archived project retained for reference.

## Overview

The default `master` branch is a documentation and licensing index. Special-release code is stored in `Xmas20/1.16.1`, `Xmas20/1.16.3` and `Xmas20/20w46a`. Select a branch before building; its name does not necessarily match the exact Minecraft dependency version.

## Technology and Dependencies

The example branch uses Java 8, Gradle Wrapper, Fabric Loom 0.4-SNAPSHOT, Minecraft 1.16.4, Fabric Loader and Fabric API. Dependencies are historical and their repositories may need maintenance.

## Repository Structure

- `README.md` — default-branch index; source branches add src/, build.gradle and Gradle Wrapper
- `LICENSE` — current license text
- `OLD_LICENSE` — historical license text

## Quick Start

Use a separate checkout of a source branch, for example:

```bash
git clone --branch Xmas20/1.16.3 https://github.com/Rayawa/sweet_potato-source-specialRelease.git
cd sweet_potato-source-specialRelease
./gradlew build
```

Use `gradlew.bat build` on Windows. Check `gradle.properties` before installing the matching JDK/game dependencies. The default `master` branch has no build task. Consult `LICENSE` and `OLD_LICENSE` for the retained licensing material.
