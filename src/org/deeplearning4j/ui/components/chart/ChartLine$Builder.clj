(ns org.deeplearning4j.ui.components.chart.ChartLine$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartLine$Builder]))

(defn ->builder
  "Constructor.

  title - `java.lang.String`
  style - `org.deeplearning4j.ui.components.chart.style.StyleChart`"
  (^ChartLine$Builder [^java.lang.String title ^org.deeplearning4j.ui.components.chart.style.StyleChart style]
    (new ChartLine$Builder title style)))

(defn add-series
  "series-name - `java.lang.String`
  x-values - `double[]`
  y-values - `double[]`

  returns: `org.deeplearning4j.ui.components.chart.ChartLine$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartLine$Builder [^ChartLine$Builder this ^java.lang.String series-name x-values y-values]
    (-> this (.addSeries series-name x-values y-values))))

(defn build
  "returns: `org.deeplearning4j.ui.components.chart.ChartLine`"
  (^org.deeplearning4j.ui.components.chart.ChartLine [^ChartLine$Builder this]
    (-> this (.build))))

