(ns org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.datasets.datavec RecordReaderMultiDataSetIterator$Builder]))

(defn ->builder
  "Constructor.

  batch-size - The batch size for the RecordReaderMultiDataSetIterator - `int`"
  (^RecordReaderMultiDataSetIterator$Builder [^Integer batch-size]
    (new RecordReaderMultiDataSetIterator$Builder batch-size)))

(defn sequence-alignment-mode
  "Set the sequence alignment mode for all sequences

  alignment-mode - `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$AlignmentMode`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$AlignmentMode alignment-mode]
    (-> this (.sequenceAlignmentMode alignment-mode))))

(defn build
  "Create the RecordReaderMultiDataSetIterator

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator [^RecordReaderMultiDataSetIterator$Builder this]
    (-> this (.build))))

(defn add-input-one-hot
  "Add as an input a single column from the specified RecordReader / SequenceRecordReader
  The assumption is that the specified column contains integer values in range 0..numClasses-1;
  this integer will be converted to a one-hot representation

  reader-name - Name of the RecordReader or SequenceRecordReader - `java.lang.String`
  column - Column that contains the index - `int`
  num-classes - Total number of classes - `int`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^java.lang.String reader-name ^Integer column ^Integer num-classes]
    (-> this (.addInputOneHot reader-name column num-classes))))

(defn add-reader
  "Add a RecordReader for use in .addInput(...) or .addOutput(...)

  reader-name - Name of the reader (for later reference) - `java.lang.String`
  record-reader - RecordReader - `org.datavec.api.records.reader.RecordReader`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^java.lang.String reader-name ^org.datavec.api.records.reader.RecordReader record-reader]
    (-> this (.addReader reader-name record-reader))))

(defn add-output
  "Add an output, with a subset of the columns from the named RecordReader or SequenceRecordReader

  reader-name - Name of the reader - `java.lang.String`
  column-first - First column index - `int`
  column-last - Last column index (inclusive) - `int`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^java.lang.String reader-name ^Integer column-first ^Integer column-last]
    (-> this (.addOutput reader-name column-first column-last)))
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^java.lang.String reader-name]
    (-> this (.addOutput reader-name))))

(defn add-input
  "Set as an input, a subset of the specified RecordReader or SequenceRecordReader

  reader-name - Name of the reader - `java.lang.String`
  column-first - First column index, inclusive - `int`
  column-last - Last column index, inclusive - `int`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^java.lang.String reader-name ^Integer column-first ^Integer column-last]
    (-> this (.addInput reader-name column-first column-last)))
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^java.lang.String reader-name]
    (-> this (.addInput reader-name))))

(defn add-output-one-hot
  "An an output, where the output is taken from a single column from the specified RecordReader / SequenceRecordReader
  The assumption is that the specified column contains integer values in range 0..numClasses-1;
  this integer will be converted to a one-hot representation (usually for classification)

  reader-name - Name of the RecordReader / SequenceRecordReader - `java.lang.String`
  column - index of the column - `int`
  num-classes - Number of classes - `int`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^java.lang.String reader-name ^Integer column ^Integer num-classes]
    (-> this (.addOutputOneHot reader-name column num-classes))))

(defn time-series-random-offset
  "For use with timeseries trained with tbptt
  In a given minbatch, shorter time series are padded and appropriately masked to be the same length as the longest time series.
  Cases with a skewed distrbution of lengths can result in the last few updates from the time series coming from mostly masked time steps.
  timeSeriesRandomOffset randomly offsettsthe time series  masking appropriately to address this

  time-series-random-offset - `boolean`
  rng-seed - seed for reproducibility - `long`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^Boolean time-series-random-offset ^Long rng-seed]
    (-> this (.timeSeriesRandomOffset time-series-random-offset rng-seed))))

(defn add-sequence-reader
  "Add a SequenceRecordReader for use in .addInput(...) or .addOutput(...)

  seq-reader-name - Name of the sequence reader (for later reference) - `java.lang.String`
  seq-record-reader - SequenceRecordReader - `org.datavec.api.records.reader.SequenceRecordReader`

  returns: `org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder`"
  (^org.deeplearning4j.datasets.datavec.RecordReaderMultiDataSetIterator$Builder [^RecordReaderMultiDataSetIterator$Builder this ^java.lang.String seq-reader-name ^org.datavec.api.records.reader.SequenceRecordReader seq-record-reader]
    (-> this (.addSequenceReader seq-reader-name seq-record-reader))))

