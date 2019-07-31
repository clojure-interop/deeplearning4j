(ns org.deeplearning4j.ui.api.Utils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api Utils]))

(defn *color-to-hex
  "Convert an AWT color to a hex color string, such as #000000

  color - `java.awt.Color`

  returns: `java.lang.String`"
  (^java.lang.String [^java.awt.Color color]
    (Utils/colorToHex color)))

