/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

grammar TransferRule;

import Literals, Symbol;

sentences: rules+ SEMI_?;

rules:identifiers                                       # IdentifierRule
    | keyWords                                          # KeywordsRule
    | rules (EQ_? rules)+                               # EqualRule
    | LBE_ COMMA_? rules (VERTICAL_BAR_ rules)* rbeMulti  # LBEMultiRule
    | LBE_ COMMA_? rules (VERTICAL_BAR_ rules)* RBE_      # LBERule
    | LBT_ COMMA_? rules (VERTICAL_BAR_ rules)* rbtMulti  # LBTMultiRule
    | LBT_ COMMA_? rules (VERTICAL_BAR_ rules)* RBT_      # LBTRule
    | LP_ COMMA_? rules (VERTICAL_BAR_ rules)* RP_        # LPRule
    | SQ_ identifiers SQ_                                 # SQRule
    | AT_ rules                                           # ATRule
    | VERTICAL_BAR_ rules                                 # VERTICALRule
    | SQ_ symbols SQ_                                     # SymbolRule
    ;

identifiers: (IDENTIFIER_ DOT_? IDENTIFIER_?)+;

keyWords: KEYWORD_+;

symbols: (LP_|RP_|LBE_|RBE_|LBT_|RBT_|SEMI_|COLON_|MLT_|DOT_|VERTICAL_BAR_|EQ_|COMMA_|SQ_|AT_);

rbtMulti: RBT_ MLT_;

rbeMulti: RBE_ MLT_;
