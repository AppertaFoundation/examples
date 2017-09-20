/*
 * Copyright (c) 2010-2014 Marand d.o.o. (www.marand.com)
 *
 * This file is part of Think!Med Clinical Medication Management.
 *
 * Think!Med Clinical Medication Management is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Think!Med Clinical Medication Management is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Think!Med Clinical Medication Management.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.marand.thinkmed.medications.dto;

import java.util.ArrayList;
import java.util.List;

import com.marand.thinkmed.medications.dto.dose.TimedSimpleDoseElementDto;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @author Bostjan Vester
 */
public class VariableSimpleTherapyDto extends SimpleTherapyDto implements VariableTherapy
{
  private List<TimedSimpleDoseElementDto> timedDoseElements = new ArrayList<>();

  public VariableSimpleTherapyDto()
  {
    super(true);
  }

  public List<TimedSimpleDoseElementDto> getTimedDoseElements()
  {
    return timedDoseElements;
  }

  public void setTimedDoseElements(final List<TimedSimpleDoseElementDto> timedDoseElements)
  {
    this.timedDoseElements = timedDoseElements;
  }

  @Override
  protected void appendToString(final ToStringBuilder tsb)
  {
    super.appendToString(tsb);
    tsb
        .append("timedDoseElements", timedDoseElements)
    ;
  }
}
