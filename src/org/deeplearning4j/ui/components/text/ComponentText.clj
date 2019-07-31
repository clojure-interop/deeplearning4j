(ns org.deeplearning4j.ui.components.text.ComponentText
  "Simple text component with styling"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.text ComponentText]))

(defn ->component-text
  "Constructor.

  text - `java.lang.String`
  style - `org.deeplearning4j.ui.components.text.style.StyleText`"
  (^ComponentText [^java.lang.String text ^org.deeplearning4j.ui.components.text.style.StyleText style]
    (new ComponentText text style))
  (^ComponentText []
    (new ComponentText )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ComponentText/COMPONENT_TYPE)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ComponentText this]
    (-> this (.toString))))

