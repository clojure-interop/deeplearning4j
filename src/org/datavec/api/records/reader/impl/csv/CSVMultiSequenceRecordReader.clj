(ns org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader
  "CSVMultiSequenceRecordReader: Used to read CSV-format time series (sequence) data where there are multiple
 independent sequences in each file.
 The assumption is that each sequence is separated by some delimiter - for example, a blank line between sequences,
 or some other line that can be detected by a regex.
 Note that the number of columns (i.e., number of lines in the CSV per sequence) must be the same for all sequences.

 It supports 3 CSVMultiSequenceRecordReader.Modes:
 (a) CONCAT mode: the output is a univariate (single column) sequence with the values from all lines
 (b) EQUAL_LENGTH: Require that all lines have the exact same number of tokens
 (c) PAD: For any shorter lines (fewer tokens), a user-specified padding Writable value will be used to make them the same
 length as the other sequences

 Example:
 Input data:


   a,b,c
    1,2

    A,B,C
    D,E,F
 Output:
 (a) CONCAT: two sequences of length 5 and 6 respectively: [a,b,c,1,2] and [A,B,C,D,E,F]
 (b) EQUAL_LENGTH: Exception: because lines (a,b,c) and (1,2) have different lengths. If the second line was \"1,2,3\" instead,
 the output would be two sequences with 2 columns each, sequence length 3: [[a,b,c],[1,2,3]] and [[A,B,C],[D,E,F]]
 (c) PAD: two sequences with 2 columns each, sequence length 3: [[a,b,c],[1,2,PAD]] and [[A,B,C],[D,E,F]], where \"PAD\"
 is a user-specified padding value

 Note that the user has to specify a sequence separator regex: for \"sequences are separated by an empty line\" use \"^$\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv CSVMultiSequenceRecordReader]))

(defn ->csv-multi-sequence-record-reader
  "Constructor.

  Create a sequence reader using the default value for skip lines (0), the default delimiter (',') and the default
  quote character ('\"')

  skip-num-lines - Number of lines to skip - `int`
  element-delimiter - Delimiter for elements - i.e., ',' if lines are comma separated - `char`
  quote - `char`
  sequence-separator-regex - The sequence separator regex. Use \"^$\" for \"sequences are separated by an empty line - `java.lang.String`
  mode - Mode: see CSVMultiSequenceRecordReader javadoc - `org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode`
  pad-value - Padding value for padding short sequences. Only used/allowable with CSVMultiSequenceRecordReader.Mode.PAD,should be null otherwise - `org.datavec.api.writable.Writable`"
  (^CSVMultiSequenceRecordReader [^Integer skip-num-lines ^Character element-delimiter ^Character quote ^java.lang.String sequence-separator-regex ^org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode mode ^org.datavec.api.writable.Writable pad-value]
    (new CSVMultiSequenceRecordReader skip-num-lines element-delimiter quote sequence-separator-regex mode pad-value))
  (^CSVMultiSequenceRecordReader [^java.lang.String sequence-separator-regex ^org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode mode ^org.datavec.api.writable.Writable pad-value]
    (new CSVMultiSequenceRecordReader sequence-separator-regex mode pad-value))
  (^CSVMultiSequenceRecordReader [^java.lang.String sequence-separator-regex ^org.datavec.api.records.reader.impl.csv.CSVMultiSequenceRecordReader$Mode mode]
    (new CSVMultiSequenceRecordReader sequence-separator-regex mode)))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^CSVMultiSequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^CSVMultiSequenceRecordReader this]
    (-> this (.sequenceRecord))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^CSVMultiSequenceRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^CSVMultiSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^CSVMultiSequenceRecordReader this]
    (-> this (.batchesSupported))))

