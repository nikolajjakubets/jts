/*
 * Copyright 2012 jts
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.jts.data.common;

import ru.jts.annotations.data.value.IntValue;
import ru.jts.annotations.data.value.StringValue;

public class ItemName_Count {
    @StringValue(withoutName = true)
    public String itemName; // Название предмета
    @IntValue(withoutName = true)
    public int count; // Количество
}