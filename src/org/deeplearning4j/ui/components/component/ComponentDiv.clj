(ns org.deeplearning4j.ui.components.component.ComponentDiv
  "Div component (as in, HTML div)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.component ComponentDiv]))

(defn ->component-div
  "Constructor.

  style - `org.deeplearning4j.ui.api.Style`
  components - `org.deeplearning4j.ui.api.Component`"
  (^ComponentDiv [^org.deeplearning4j.ui.api.Style style ^org.deeplearning4j.ui.api.Component components]
    (new ComponentDiv style components))
  (^ComponentDiv []
    (new ComponentDiv )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ComponentDiv/COMPONENT_TYPE)

