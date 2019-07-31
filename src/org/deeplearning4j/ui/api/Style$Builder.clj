(ns org.deeplearning4j.ui.api.Style$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api Style$Builder]))

(defn ->builder
  "Constructor."
  (^Style$Builder []
    (new Style$Builder )))

(defn width
  "width - `double`
  width-unit - `org.deeplearning4j.ui.api.LengthUnit`

  returns: `T`"
  ([^Style$Builder this ^Double width ^org.deeplearning4j.ui.api.LengthUnit width-unit]
    (-> this (.width width width-unit))))

(defn height
  "height - `double`
  height-unit - `org.deeplearning4j.ui.api.LengthUnit`

  returns: `T`"
  ([^Style$Builder this ^Double height ^org.deeplearning4j.ui.api.LengthUnit height-unit]
    (-> this (.height height height-unit))))

(defn margin
  "unit - `org.deeplearning4j.ui.api.LengthUnit`
  margin-top - `java.lang.Integer`
  margin-bottom - `java.lang.Integer`
  margin-left - `java.lang.Integer`
  margin-right - `java.lang.Integer`

  returns: `T`"
  ([^Style$Builder this ^org.deeplearning4j.ui.api.LengthUnit unit ^java.lang.Integer margin-top ^java.lang.Integer margin-bottom ^java.lang.Integer margin-left ^java.lang.Integer margin-right]
    (-> this (.margin unit margin-top margin-bottom margin-left margin-right))))

(defn background-color
  "color - `java.awt.Color`

  returns: `T`"
  ([^Style$Builder this ^java.awt.Color color]
    (-> this (.backgroundColor color))))

