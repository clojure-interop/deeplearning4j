(ns org.deeplearning4j.evaluation.EvaluationTools
  "Tools for evaluation and rendering ROC and ROCMultiClass results"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.evaluation EvaluationTools]))

(defn *export-roc-charts-to-html-file
  "Given a ROC chart, export the ROC chart and precision vs. recall charts to a stand-alone HTML file

  roc - ROC to export - `org.deeplearning4j.eval.ROC`
  file - File to export to - `java.io.File`

  throws: java.io.IOException"
  ([^org.deeplearning4j.eval.ROC roc ^java.io.File file]
    (EvaluationTools/exportRocChartsToHtmlFile roc file)))

(defn *roc-chart-to-html
  "Given a ROCMultiClass instance and (optionally) names for each class, render the ROC chart to a stand-alone
  HTML file (returned as a String)

  roc-multi-class - ROC to render - `org.deeplearning4j.eval.ROCMultiClass`
  class-names - Names of the classes. May be null - `java.util.List`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.eval.ROCMultiClass roc-multi-class ^java.util.List class-names]
    (EvaluationTools/rocChartToHtml roc-multi-class class-names))
  (^java.lang.String [^org.deeplearning4j.eval.ROC roc]
    (EvaluationTools/rocChartToHtml roc)))

(defn *exportevaluation-calibration-to-html-file
  "Given a EvaluationCalibration instance, export the charts to a stand-alone HTML file

  ec - EvaluationCalibration instance to export HTML charts for - `org.deeplearning4j.eval.EvaluationCalibration`
  file - File to export to - `java.io.File`

  throws: java.io.IOException"
  ([^org.deeplearning4j.eval.EvaluationCalibration ec ^java.io.File file]
    (EvaluationTools/exportevaluationCalibrationToHtmlFile ec file)))

(defn *evaluation-calibration-to-html
  "ec - `org.deeplearning4j.eval.EvaluationCalibration`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.eval.EvaluationCalibration ec]
    (EvaluationTools/evaluationCalibrationToHtml ec)))

