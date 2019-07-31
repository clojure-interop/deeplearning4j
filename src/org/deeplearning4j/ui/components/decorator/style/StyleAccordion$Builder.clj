(ns org.deeplearning4j.ui.components.decorator.style.StyleAccordion$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.decorator.style StyleAccordion$Builder]))

(defn ->builder
  "Constructor."
  (^StyleAccordion$Builder []
    (new StyleAccordion$Builder )))

(defn build
  "returns: `org.deeplearning4j.ui.components.decorator.style.StyleAccordion`"
  (^org.deeplearning4j.ui.components.decorator.style.StyleAccordion [^StyleAccordion$Builder this]
    (-> this (.build))))

