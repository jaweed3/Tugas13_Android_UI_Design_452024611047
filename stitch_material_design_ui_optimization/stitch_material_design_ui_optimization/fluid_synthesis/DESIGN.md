---
name: Fluid Synthesis
colors:
  surface: '#f8f9ff'
  surface-dim: '#cbdbf5'
  surface-bright: '#f8f9ff'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#eff4ff'
  surface-container: '#e5eeff'
  surface-container-high: '#dce9ff'
  surface-container-highest: '#d3e4fe'
  on-surface: '#0b1c30'
  on-surface-variant: '#434655'
  inverse-surface: '#213145'
  inverse-on-surface: '#eaf1ff'
  outline: '#737686'
  outline-variant: '#c3c6d7'
  surface-tint: '#0053db'
  primary: '#004ac6'
  on-primary: '#ffffff'
  primary-container: '#2563eb'
  on-primary-container: '#eeefff'
  inverse-primary: '#b4c5ff'
  secondary: '#712ae2'
  on-secondary: '#ffffff'
  secondary-container: '#8a4cfc'
  on-secondary-container: '#fffbff'
  tertiary: '#ad0033'
  on-tertiary: '#ffffff'
  tertiary-container: '#d22348'
  on-tertiary-container: '#ffecec'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#dbe1ff'
  primary-fixed-dim: '#b4c5ff'
  on-primary-fixed: '#00174b'
  on-primary-fixed-variant: '#003ea8'
  secondary-fixed: '#eaddff'
  secondary-fixed-dim: '#d2bbff'
  on-secondary-fixed: '#25005a'
  on-secondary-fixed-variant: '#5a00c6'
  tertiary-fixed: '#ffdadb'
  tertiary-fixed-dim: '#ffb2b7'
  on-tertiary-fixed: '#40000d'
  on-tertiary-fixed-variant: '#92002a'
  background: '#f8f9ff'
  on-background: '#0b1c30'
  surface-variant: '#d3e4fe'
typography:
  display-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 48px
    fontWeight: '700'
    lineHeight: 56px
    letterSpacing: -0.02em
  headline-lg:
    fontFamily: Plus Jakarta Sans
    fontSize: 32px
    fontWeight: '600'
    lineHeight: 40px
  headline-lg-mobile:
    fontFamily: Plus Jakarta Sans
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 32px
  headline-md:
    fontFamily: Plus Jakarta Sans
    fontSize: 24px
    fontWeight: '600'
    lineHeight: 32px
  body-lg:
    fontFamily: Manrope
    fontSize: 18px
    fontWeight: '400'
    lineHeight: 28px
  body-md:
    fontFamily: Manrope
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 24px
  label-md:
    fontFamily: Manrope
    fontSize: 14px
    fontWeight: '600'
    lineHeight: 20px
    letterSpacing: 0.01em
  label-sm:
    fontFamily: Manrope
    fontSize: 12px
    fontWeight: '500'
    lineHeight: 16px
rounded:
  sm: 0.5rem
  DEFAULT: 1rem
  md: 1.5rem
  lg: 2rem
  xl: 3rem
  full: 9999px
spacing:
  unit: 4px
  gutter: 24px
  margin-mobile: 16px
  margin-desktop: 40px
  container-max: 1280px
---

## Brand & Style

The design system is built on the philosophy of "Fluid Synthesis"—a fusion of high-utility enterprise functionality with an ultra-organic, approachable aesthetic. It targets modern professionals who value tools that feel human and tactile rather than rigid and mechanical. 

The visual style is a sophisticated evolution of **Minimalism** blended with **Glassmorphism**. By eliminating sharp corners entirely, the UI evokes a sense of continuous flow and safety. The interface should feel like polished river stones: smooth, substantial, and naturally ergonomic. Every interaction is designed to feel soft and intentional, reducing cognitive friction through a friendly but disciplined visual language.

## Colors

The palette utilizes "Organic Enterprise" tones—professional blues and purples softened by a sophisticated neutral scale. 

- **Primary:** An energetic but deep blue used for main actions and brand presence.
- **Secondary:** A refined violet used for accents and creative workflows.
- **Tertiary:** A warm rose used sparingly for highlighting or critical feedback.
- **Neutral:** A slate-based scale that leans slightly cool to maintain a modern, clean environment.

Backgrounds should primarily use off-whites and very subtle grey tints to allow the pill-shaped surfaces to sit comfortably within the layout without harsh contrast.

## Typography

This design system uses a dual-font approach to balance personality with readability. **Plus Jakarta Sans** is used for headings; its soft terminals and contemporary geometric shapes perfectly mirror the pill-shaped UI elements. For body text and interface labels, **Manrope** provides a highly legible, modern grotesque structure that maintains the "Modern/Refined" brand pillar.

Large display type should use tighter letter spacing to emphasize the bold, organic headlines. Body text should remain generously spaced to ensure maximum accessibility and a "breathable" feel across data-heavy enterprise screens.

## Layout & Spacing

The layout follows a **Fluid Grid** system with a focus on generous internal padding to accommodate the extreme corner radii. Because surfaces are fully rounded, they require more "breathing room" at the corners to prevent content from feeling clipped.

- **Grid:** A 12-column system for desktop, shifting to 4 columns for mobile.
- **Rhythm:** An 8px base unit drives all spacing (padding, gaps, and margins). 
- **Adaptation:** On mobile, horizontal margins are reduced, but the vertical "stacking" of pill-shaped cards remains consistent to maintain the design system's signature soft silhouette.

## Elevation & Depth

To complement the ultra-rounded shapes, elevation is handled through **Tonal Layers** and **Ambient Shadows**. 

Avoid harsh, black shadows. Instead, use soft, diffused shadows with a slight tint of the primary or neutral color. This "Ambient" approach makes components appear as if they are floating gently above the surface rather than being forced onto a 2D plane. 

Glassmorphism is applied to persistent navigation elements (sidebars, top bars). These use a high-blur backdrop filter (20px+) and a very thin, semi-transparent white border to define the edge of the pill-shape without creating visual heaviness.

## Shapes

The defining characteristic of this design system is its **maximum roundedness**. Every structural element—from the smallest checkbox to the largest dashboard container—utilizes a "Pill" or "Stadium" shape.

- **Small elements (Buttons, Inputs):** 9999px radius to ensure a perfect semi-circle on the ends.
- **Large elements (Cards, Modals, Sections):** Radius should be set to 3rem (48px) or higher, creating an ultra-soft frame that removes any sense of "boxed-in" content.
- **Consistent Curvature:** When nesting rounded elements (e.g., a button inside a card), ensure the inner radius is proportional to the outer radius to maintain a harmonious "concentric" look.

## Components

### Buttons & Chips
Buttons are always fully pill-shaped. Primary buttons use a solid fill with white text, while secondary buttons use a ghost style with a 1.5px border. Chips follow the same pill geometry but at a smaller scale, typically using a light tonal background.

### Input Fields
Search bars and form inputs must be fully rounded. Padding-left and padding-right must be increased (minimum 24px) to ensure text does not collide with the curve of the pill shape. Icons within inputs should be inset from the curve.

### Cards & Surfaces
Cards are the primary container. They should feature a 3rem (48px) corner radius. For cards containing images, the image itself must be clipped to the same radius to ensure a seamless, organic look.

### Checkboxes & Radio Buttons
To maintain the shape language, checkboxes are evolved into "Soft Squares" with a high radius (8px), while radio buttons remain perfect circles. Toggle switches are the preferred selection component, as their naturally pill-shaped track perfectly matches the system's core identity.

### Navigation
Sidebars and Top-navs use large radii on their inner corners (facing the content area) to create a "nested" or "poured" feel for the main workspace.