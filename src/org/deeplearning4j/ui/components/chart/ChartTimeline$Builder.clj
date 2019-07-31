(ns org.deeplearning4j.ui.components.chart.ChartTimeline$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartTimeline$Builder]))

(defn ->builder
  "Constructor.

  title - `java.lang.String`
  style - `org.deeplearning4j.ui.components.chart.style.StyleChart`"
  (^ChartTimeline$Builder [^java.lang.String title ^org.deeplearning4j.ui.components.chart.style.StyleChart style]
    (new ChartTimeline$Builder title style)))

(defn add-lane
  "name - `java.lang.String`
  data - `java.util.List`

  returns: `org.deeplearning4j.ui.components.chart.ChartTimeline$Builder`"
  (^org.deeplearning4j.ui.components.chart.ChartTimeline$Builder [^ChartTimeline$Builder this ^java.lang.String name ^java.util.List data]
    (-> this (.addLane name data))))

(defn build
  "returns: `org.deeplearning4j.ui.components.chart.ChartTimeline`"
  (^org.deeplearning4j.ui.components.chart.ChartTimeline [^ChartTimeline$Builder this]
    (-> this (.build))))

