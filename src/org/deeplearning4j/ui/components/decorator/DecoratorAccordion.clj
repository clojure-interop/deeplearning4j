(ns org.deeplearning4j.ui.components.decorator.DecoratorAccordion
  "Accordion decorator component: i.e., create an accordion (i.e., collapseable componenet) with multiple sub-components internally
 Current implementation supports only one accordion section"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.decorator DecoratorAccordion]))

(defn ->decorator-accordion
  "Constructor."
  (^DecoratorAccordion []
    (new DecoratorAccordion )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  DecoratorAccordion/COMPONENT_TYPE)

