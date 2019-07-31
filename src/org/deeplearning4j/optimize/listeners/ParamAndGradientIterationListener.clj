(ns org.deeplearning4j.optimize.listeners.ParamAndGradientIterationListener
  "An iteration listener that provides details on parameters and gradients at each iteration during traning.
 Attempts to provide much of the same information as the UI histogram iteration listener, but in a text-based
 format (for example, when learning on a system accessed via SSH etc).
 i.e., is intended to aid network tuning and debugging
 This iteration listener is set up to calculate mean, min, max, and mean absolute value
 of each type of parameter and gradient in the network at each iteration.
 These"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners ParamAndGradientIterationListener]))

(defn ->param-and-gradient-iteration-listener
  "Constructor.

  Full constructor with all options.
  Note also: ParamAndGradientIterationListener.builder() can be used instead of this constructor.

  iterations - calculate and report values every 'iterations' iterations - `int`
  print-header - Whether to output a header row (i.e., names for each column) - `boolean`
  print-mean - Calculate and display the mean of parameters and gradients - `boolean`
  print-min-max - Calculate and display the min/max of the parameters and gradients - `boolean`
  print-mean-abs-value - Calculate and display the mean absolute value - `boolean`
  output-to-console - If true, display the values to the console (System.out.println()) - `boolean`
  output-to-file - If true, write the values to a file, one per line - `boolean`
  output-to-logger - If true, log the values - `boolean`
  file - File to write values to. May be null, not used if outputToFile == false - `java.io.File`
  delimiter - delimiter (for example, \"\\t\" or \",\" etc) - `java.lang.String`"
  (^ParamAndGradientIterationListener [^Integer iterations ^Boolean print-header ^Boolean print-mean ^Boolean print-min-max ^Boolean print-mean-abs-value ^Boolean output-to-console ^Boolean output-to-file ^Boolean output-to-logger ^java.io.File file ^java.lang.String delimiter]
    (new ParamAndGradientIterationListener iterations print-header print-mean print-min-max print-mean-abs-value output-to-console output-to-file output-to-logger file delimiter))
  (^ParamAndGradientIterationListener []
    (new ParamAndGradientIterationListener )))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^ParamAndGradientIterationListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

