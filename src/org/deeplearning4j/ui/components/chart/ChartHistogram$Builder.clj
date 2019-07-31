(ns org.deeplearning4j.ui.components.chart.ChartHistogram$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartHistogram$Builder]))

(defn ->builder
  "Constructor.

  title - `java.lang.String`
  style - `org.deeplearning4j.ui.components.chart.style.StyleChart`"
  (^ChartHistogram$Builder [^java.lang.String title ^org.deeplearning4j.ui.components.chart.style.StyleChart style]
    (new ChartHistogram$Builder title style)))

(defn add-bin
  "Add a single bin

  lower - Lower (minimum/left) value for the bin (x axis) - `double`
  upper - Upper (maximum/right) value for the bin (x axis) - `double`
  y-value - The height of the bin - `double`

  returns: `org.deeplearning4j.ui.components.chart.ChartHistogram$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartHistogram$Builder [^ChartHistogram$Builder this ^Double lower ^Double upper ^Double y-value]
    (-> this (.addBin lower upper y-value))))

(defn build
  "returns: `org.deeplearning4j.ui.components.chart.ChartHistogram`"
  (^org.deeplearning4j.ui.components.chart.ChartHistogram [^ChartHistogram$Builder this]
    (-> this (.build))))

