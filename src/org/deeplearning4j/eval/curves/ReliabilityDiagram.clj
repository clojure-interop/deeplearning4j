(ns org.deeplearning4j.eval.curves.ReliabilityDiagram
  "Created by Alex on 05/07/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.curves ReliabilityDiagram]))

(defn ->reliability-diagram
  "Constructor.

  title - `java.lang.String`
  mean-predicted-value-x - `double[]`
  fraction-positives-y - `double[]`"
  (^ReliabilityDiagram [^java.lang.String title mean-predicted-value-x fraction-positives-y]
    (new ReliabilityDiagram title mean-predicted-value-x fraction-positives-y)))

(defn num-points
  "returns: The number of points in the curve - `int`"
  (^Integer [^ReliabilityDiagram this]
    (-> this (.numPoints))))

(defn get-x
  "returns: X axis values - `double[]`"
  ([^ReliabilityDiagram this]
    (-> this (.getX))))

(defn get-y
  "returns: Y-axis values - `double[]`"
  ([^ReliabilityDiagram this]
    (-> this (.getY))))

(defn get-title
  "returns: Title for the curve - `java.lang.String`"
  (^java.lang.String [^ReliabilityDiagram this]
    (-> this (.getTitle))))

