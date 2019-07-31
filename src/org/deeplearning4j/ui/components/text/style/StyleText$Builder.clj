(ns org.deeplearning4j.ui.components.text.style.StyleText$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.text.style StyleText$Builder]))

(defn ->builder
  "Constructor."
  (^StyleText$Builder []
    (new StyleText$Builder )))

(defn font
  "Specify the font to be used for the text

  font - `java.lang.String`

  returns: `org.deeplearning4j.ui.components.text.style.StyleText$Builder`"
  (^org.deeplearning4j.ui.components.text.style.StyleText$Builder [^StyleText$Builder this ^java.lang.String font]
    (-> this (.font font))))

(defn font-size
  "Size of the font (pt)

  size - `double`

  returns: `org.deeplearning4j.ui.components.text.style.StyleText$Builder`"
  (^org.deeplearning4j.ui.components.text.style.StyleText$Builder [^StyleText$Builder this ^Double size]
    (-> this (.fontSize size))))

(defn underline
  "If true: text should be underlined (default: not)

  underline - `boolean`

  returns: `org.deeplearning4j.ui.components.text.style.StyleText$Builder`"
  (^org.deeplearning4j.ui.components.text.style.StyleText$Builder [^StyleText$Builder this ^Boolean underline]
    (-> this (.underline underline))))

(defn color
  "Color for the text

  color - `java.awt.Color`

  returns: `org.deeplearning4j.ui.components.text.style.StyleText$Builder`"
  (^org.deeplearning4j.ui.components.text.style.StyleText$Builder [^StyleText$Builder this ^java.awt.Color color]
    (-> this (.color color))))

(defn whitespace-pre
  "If set to true: add a \"white-space: pre\" to the style.
  In effect, this stops the representation from compressing the whitespace characters, and messing up/removing
  text that contains newlines, tabs, etc.

  whitespace-pre - `boolean`

  returns: `org.deeplearning4j.ui.components.text.style.StyleText$Builder`"
  (^org.deeplearning4j.ui.components.text.style.StyleText$Builder [^StyleText$Builder this ^Boolean whitespace-pre]
    (-> this (.whitespacePre whitespace-pre))))

(defn build
  "returns: `org.deeplearning4j.ui.components.text.style.StyleText`"
  (^org.deeplearning4j.ui.components.text.style.StyleText [^StyleText$Builder this]
    (-> this (.build))))

