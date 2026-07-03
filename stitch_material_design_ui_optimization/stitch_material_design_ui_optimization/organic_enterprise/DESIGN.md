---
name: Organic Enterprise
colors:
  surface: '#f9f9f9'
  surface-dim: '#dadada'
  surface-bright: '#f9f9f9'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f3f3f3'
  surface-container: '#eeeeee'
  surface-container-high: '#e8e8e8'
  surface-container-highest: '#e2e2e2'
  on-surface: '#1a1c1c'
  on-surface-variant: '#424656'
  inverse-surface: '#2f3131'
  inverse-on-surface: '#f1f1f1'
  outline: '#737687'
  outline-variant: '#c3c6d8'
  surface-tint: '#0052dd'
  primary: '#004ccd'
  on-primary: '#ffffff'
  primary-container: '#0f62fe'
  on-primary-container: '#f3f3ff'
  inverse-primary: '#b4c5ff'
  secondary: '#5e5d66'
  on-secondary: '#ffffff'
  secondary-container: '#e1dee9'
  on-secondary-container: '#62626a'
  tertiary: '#9e3100'
  on-tertiary: '#ffffff'
  tertiary-container: '#c84000'
  on-tertiary-container: '#fff1ed'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#dbe1ff'
  primary-fixed-dim: '#b4c5ff'
  on-primary-fixed: '#00174c'
  on-primary-fixed-variant: '#003da9'
  secondary-fixed: '#e4e1eb'
  secondary-fixed-dim: '#c7c5cf'
  on-secondary-fixed: '#1b1b22'
  on-secondary-fixed-variant: '#46464e'
  tertiary-fixed: '#ffdbd0'
  tertiary-fixed-dim: '#ffb59d'
  on-tertiary-fixed: '#390c00'
  on-tertiary-fixed-variant: '#832700'
  background: '#f9f9f9'
  on-background: '#1a1c1c'
  surface-variant: '#e2e2e2'
typography:
  headline-xl:
    fontFamily: Hanken Grotesk
    fontSize: 48px
    fontWeight: '600'
    lineHeight: 56px
    letterSpacing: -0.02em
  headline-lg:
    fontFamily: Hanken Grotesk
    fontSize: 32px
    fontWeight: '600'
    lineHeight: 40px
    letterSpacing: -0.01em
  headline-lg-mobile:
    fontFamily: Hanken Grotesk
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 32px
  headline-md:
    fontFamily: Hanken Grotesk
    fontSize: 24px
    fontWeight: '500'
    lineHeight: 32px
  body-lg:
    fontFamily: IBM Plex Sans
    fontSize: 18px
    fontWeight: '400'
    lineHeight: 28px
  body-md:
    fontFamily: IBM Plex Sans
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
  body-sm:
    fontFamily: IBM Plex Sans
    fontSize: 14px
    fontWeight: '400'
    lineHeight: 20px
  label-md:
    fontFamily: IBM Plex Sans
    fontSize: 14px
    fontWeight: '600'
    lineHeight: 16px
    letterSpacing: 0.05em
  label-sm:
    fontFamily: IBM Plex Sans
    fontSize: 12px
    fontWeight: '500'
    lineHeight: 14px
rounded:
  sm: 0.5rem
  DEFAULT: 1rem
  md: 1.5rem
  lg: 2rem
  xl: 3rem
  full: 9999px
spacing:
  base: 8px
  xs: 4px
  sm: 12px
  md: 24px
  lg: 40px
  xl: 64px
  gutter: 24px
  margin-mobile: 16px
  margin-desktop: 48px
---

## Brand & Style

The design system blends the structural rigor of enterprise logic with a soft, organic aesthetic. It targets professional environments that prioritize user well-being and cognitive ease, moving away from the rigid "boxy" nature of traditional SaaS toward a more fluid, approachable interface.

The visual style is a hybrid of **Minimalism** and **Soft Modernism**. It utilizes expansive white space, subtle tonal layering, and extreme corner radii to create a sense of calm and premium quality. Every element is designed to feel approachable yet highly functional, ensuring that complex data remains legible within a comforting, elegant container.

## Colors

The color palette is anchored in a deep, reliable IBM-inspired Blue for primary actions, ensuring WCAG AA compliance and enterprise familiarity. 

- **Primary:** Used for high-emphasis actions, active states, and focus indicators.
- **Secondary:** Used for supportive information and secondary UI elements to maintain a quiet visual hierarchy.
- **Neutral:** A range of cool grays that define the "Organic & Elegant" aesthetic, providing soft background tiers and subtle borders.
- **Surface:** The background is kept pure white (#FFFFFF) to allow the organic shapes and soft shadows to provide the necessary depth.

## Typography

This design system utilizes a dual-type approach. **Hanken Grotesk** is employed for headings to provide a contemporary, sharp, and distinctive character. Its clean geometry complements the high-roundness shape language. 

**IBM Plex Sans** serves as the workhorse for body copy, data tables, and labels. It maintains the "Carbon" heritage, ensuring maximum legibility for technical information and enterprise-grade density. Use a tighter tracking for headlines to emphasize the modern aesthetic, while maintaining standard spacing for body text for optimal readability.

## Layout & Spacing

The system follows a 12-column fluid grid for desktop and a 4-column grid for mobile. To support the "Organic" feel, the layout prioritizes generous internal padding and wide margins. 

Spacing follows a linear scale based on 8px increments. For card containers and major sections, use `spacing.lg` to create a luxurious sense of space. Mobile layouts should reduce margins to `margin-mobile` but maintain internal padding within components to ensure touch targets remain accessible and the aesthetic remains soft.

## Elevation & Depth

Depth is achieved through **Tonal Layers** and **Ambient Shadows**. Instead of harsh borders, surfaces are differentiated by subtle shifts in background color (e.g., #FFFFFF on #F4F4F4) and very soft, diffused shadows.

- **Level 1 (Base):** Flat surfaces, differentiated by a 1px soft gray border (#E0E0E0).
- **Level 2 (Cards/Menus):** Use a shadow with a large blur (24px to 48px) and low opacity (4-6%). The shadow should have a slight blue tint derived from the primary color to keep the palette cohesive.
- **Level 3 (Modals):** High-diffusion shadows with a subtle backdrop blur (8px) to provide focus and separate the element from the organic background layers.

## Shapes

The defining characteristic of this design system is its **extra-large roundedness**. By moving away from standard 4px or 8px corners to a pill-shaped and highly radiused approach, the UI transforms from a rigid tool into an elegant experience.

- **Standard Elements:** 1rem (16px) radius for buttons and small input fields.
- **Containers:** 2rem (32px) radius for cards, sections, and modals.
- **Interactive States:** Maintain the same radius on hover; do not sharpen corners.
- **Media:** Images and video players must inherit the `rounded-xl` property to maintain the organic language.

## Components

### Buttons
Buttons use a pill-shaped profile (`rounded-xl`). Primary buttons use a solid color with white text, while secondary buttons use a ghost style with a subtle 1px border. Internal horizontal padding is increased (24px+) to balance the high corner radius.

### Cards
Cards are the primary container. They must use the `rounded-lg` (32px) radius. Avoid heavy shadows; instead, use a soft 1px border or a very light background tint to define the edges.

### Input Fields
Inputs transition from the standard box to a highly radiused form (16px). This softens the "entry" experience. Ensure the focus state uses a 2px offset ring in the primary color to maintain accessibility.

### Chips & Tags
These should be fully pill-shaped (radius: 9999px). They act as organic "pebbles" within the UI, used for filtering and status indicators.

### Lists
List items should have generous vertical padding and use rounded hover states (12px radius) that do not touch the edge of the container, creating a "floating" selection effect.