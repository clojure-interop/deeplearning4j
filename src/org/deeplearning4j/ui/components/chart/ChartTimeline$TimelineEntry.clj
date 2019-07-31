(ns org.deeplearning4j.ui.components.chart.ChartTimeline$TimelineEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.components.chart ChartTimeline$TimelineEntry]))

(defn ->timeline-entry
  "Constructor.

  entry-label - `java.lang.String`
  start-time-ms - `long`
  end-time-ms - `long`
  color - `java.awt.Color`"
  (^ChartTimeline$TimelineEntry [^java.lang.String entry-label ^Long start-time-ms ^Long end-time-ms ^java.awt.Color color]
    (new ChartTimeline$TimelineEntry entry-label start-time-ms end-time-ms color))
  (^ChartTimeline$TimelineEntry [^java.lang.String entry-label ^Long start-time-ms ^Long end-time-ms]
    (new ChartTimeline$TimelineEntry entry-label start-time-ms end-time-ms)))

