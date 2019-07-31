(ns org.deeplearning4j.ui.components.chart.ChartTimeline
  "A timeline/swimlane chart with zoom/scroll functionality.
 Time is represented here with long values - i.e., millisecond precision, epoch format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartTimeline]))

(defn ->chart-timeline
  "Constructor."
  (^ChartTimeline []
    (new ChartTimeline )))

(def *-component-type
  "Static Constant.

  type: java.lang.String"
  ChartTimeline/COMPONENT_TYPE)

