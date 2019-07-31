(ns org.deeplearning4j.ui.components.decorator.DecoratorAccordion$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.decorator DecoratorAccordion$Builder]))

(defn ->builder
  "Constructor.

  title - `java.lang.String`
  style - `org.deeplearning4j.ui.components.decorator.style.StyleAccordion`"
  (^DecoratorAccordion$Builder [^java.lang.String title ^org.deeplearning4j.ui.components.decorator.style.StyleAccordion style]
    (new DecoratorAccordion$Builder title style))
  (^DecoratorAccordion$Builder [^org.deeplearning4j.ui.components.decorator.style.StyleAccordion style]
    (new DecoratorAccordion$Builder style)))

(defn title
  "title - `java.lang.String`

  returns: `org.deeplearning4j.ui.components.decorator.DecoratorAccordion$Builder`"
  (^org.deeplearning4j.ui.components.decorator.DecoratorAccordion$Builder [^DecoratorAccordion$Builder this ^java.lang.String title]
    (-> this (.title title))))

(defn add-components
  "Components to show internally in the accordion element

  inner-components - `org.deeplearning4j.ui.api.Component`

  returns: `org.deeplearning4j.ui.components.decorator.DecoratorAccordion$Builder`"
  (^org.deeplearning4j.ui.components.decorator.DecoratorAccordion$Builder [^DecoratorAccordion$Builder this ^org.deeplearning4j.ui.api.Component inner-components]
    (-> this (.addComponents inner-components))))

(defn set-default-collapsed
  "Set the default collapsed/expanded state

  default-collapsed - If true: default to collapsed - `boolean`

  returns: `org.deeplearning4j.ui.components.decorator.DecoratorAccordion$Builder`"
  (^org.deeplearning4j.ui.components.decorator.DecoratorAccordion$Builder [^DecoratorAccordion$Builder this ^Boolean default-collapsed]
    (-> this (.setDefaultCollapsed default-collapsed))))

(defn build
  "returns: `org.deeplearning4j.ui.components.decorator.DecoratorAccordion`"
  (^org.deeplearning4j.ui.components.decorator.DecoratorAccordion [^DecoratorAccordion$Builder this]
    (-> this (.build))))

