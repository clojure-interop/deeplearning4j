(ns org.deeplearning4j.ui.components.component.style.StyleDiv$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.component.style StyleDiv$Builder]))

(defn ->builder
  "Constructor."
  (^StyleDiv$Builder []
    (new StyleDiv$Builder )))

(defn float-value
  "CSS float styling option

  float-value - `org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue`

  returns: `org.deeplearning4j.ui.components.component.style.StyleDiv$Builder`"
  (^org.deeplearning4j.ui.components.component.style.StyleDiv$Builder [^StyleDiv$Builder this ^org.deeplearning4j.ui.components.component.style.StyleDiv$FloatValue float-value]
    (-> this (.floatValue float-value))))

(defn build
  "returns: `org.deeplearning4j.ui.components.component.style.StyleDiv`"
  (^org.deeplearning4j.ui.components.component.style.StyleDiv [^StyleDiv$Builder this]
    (-> this (.build))))

