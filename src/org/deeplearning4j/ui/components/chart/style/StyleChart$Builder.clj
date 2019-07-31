(ns org.deeplearning4j.ui.components.chart.style.StyleChart$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart.style StyleChart$Builder]))

(defn ->builder
  "Constructor."
  (^StyleChart$Builder []
    (new StyleChart$Builder )))

(defn stroke-width
  "stroke-width - `double`

  returns: `org.deeplearning4j.ui.components.chart.style.StyleChart$Builder`"
  (^org.deeplearning4j.ui.components.chart.style.StyleChart$Builder [^StyleChart$Builder this ^Double stroke-width]
    (-> this (.strokeWidth stroke-width))))

(defn point-size
  "Point size, for scatter plot etc

  point-size - `double`

  returns: `org.deeplearning4j.ui.components.chart.style.StyleChart$Builder`"
  (^org.deeplearning4j.ui.components.chart.style.StyleChart$Builder [^StyleChart$Builder this ^Double point-size]
    (-> this (.pointSize point-size))))

(defn series-colors
  "colors - `java.awt.Color`

  returns: `org.deeplearning4j.ui.components.chart.style.StyleChart$Builder`"
  (^org.deeplearning4j.ui.components.chart.style.StyleChart$Builder [^StyleChart$Builder this ^java.awt.Color colors]
    (-> this (.seriesColors colors))))

(defn axis-stroke-width
  "axis-stroke-width - `double`

  returns: `org.deeplearning4j.ui.components.chart.style.StyleChart$Builder`"
  (^org.deeplearning4j.ui.components.chart.style.StyleChart$Builder [^StyleChart$Builder this ^Double axis-stroke-width]
    (-> this (.axisStrokeWidth axis-stroke-width))))

(defn title-style
  "style - `org.deeplearning4j.ui.components.text.style.StyleText`

  returns: `org.deeplearning4j.ui.components.chart.style.StyleChart$Builder`"
  (^org.deeplearning4j.ui.components.chart.style.StyleChart$Builder [^StyleChart$Builder this ^org.deeplearning4j.ui.components.text.style.StyleText style]
    (-> this (.titleStyle style))))

(defn build
  "returns: `org.deeplearning4j.ui.components.chart.style.StyleChart`"
  (^org.deeplearning4j.ui.components.chart.style.StyleChart [^StyleChart$Builder this]
    (-> this (.build))))

