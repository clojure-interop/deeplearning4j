(ns org.deeplearning4j.ui.components.table.style.StyleTable$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.table.style StyleTable$Builder]))

(defn ->builder
  "Constructor."
  (^StyleTable$Builder []
    (new StyleTable$Builder )))

(defn column-widths
  "Specify the widths for the columns

  unit - Unit that the widths are specified in - `org.deeplearning4j.ui.api.LengthUnit`
  widths - Width values for the columns - `double`

  returns: `org.deeplearning4j.ui.components.table.style.StyleTable$Builder`"
  (^org.deeplearning4j.ui.components.table.style.StyleTable$Builder [^StyleTable$Builder this ^org.deeplearning4j.ui.api.LengthUnit unit ^Double widths]
    (-> this (.columnWidths unit widths))))

(defn border-width
  "border-width-px - Width of the border, in px - `int`

  returns: `org.deeplearning4j.ui.components.table.style.StyleTable$Builder`"
  (^org.deeplearning4j.ui.components.table.style.StyleTable$Builder [^StyleTable$Builder this ^Integer border-width-px]
    (-> this (.borderWidth border-width-px))))

(defn header-color
  "color - Background color for the header row - `java.awt.Color`

  returns: `org.deeplearning4j.ui.components.table.style.StyleTable$Builder`"
  (^org.deeplearning4j.ui.components.table.style.StyleTable$Builder [^StyleTable$Builder this ^java.awt.Color color]
    (-> this (.headerColor color))))

(defn background-color
  "color - Background color for the table cells (ex. header row) - `java.awt.Color`

  returns: `org.deeplearning4j.ui.components.table.style.StyleTable$Builder`"
  (^org.deeplearning4j.ui.components.table.style.StyleTable$Builder [^StyleTable$Builder this ^java.awt.Color color]
    (-> this (.backgroundColor color))))

(defn whitespace-mode
  "Set the whitespace mode (CSS style tag). For example, \"pre\" to maintain current formatting with no wrapping,
  \"pre-wrap\" to wrap (but otherwise take into account new line characters in text, etc)

  whitespace-mode - CSS whitespace mode - `java.lang.String`

  returns: `org.deeplearning4j.ui.components.table.style.StyleTable$Builder`"
  (^org.deeplearning4j.ui.components.table.style.StyleTable$Builder [^StyleTable$Builder this ^java.lang.String whitespace-mode]
    (-> this (.whitespaceMode whitespace-mode))))

(defn build
  "returns: `org.deeplearning4j.ui.components.table.style.StyleTable`"
  (^org.deeplearning4j.ui.components.table.style.StyleTable [^StyleTable$Builder this]
    (-> this (.build))))

