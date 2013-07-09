import play.api.GlobalSettings
import play.api.mvc.WithFilters
import play.filters.csrf.CSRFFilter
import filters.DoNothingFilter
import filters.AuthenticateFilter
import filters.LoggingFilter

object Global extends WithFilters(
    new LoggingFilter, new DoNothingFilter, new AuthenticateFilter, CSRFFilter() ) with GlobalSettings 
